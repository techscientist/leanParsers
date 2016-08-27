import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CreatorModel _creator;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public int id;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public String state;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public String start_time;
	public String name;
	public String background_image;
	public String email;
	public String topic;

	public RootModel(String code_of_conduct, CreatorModel creator, String logo, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, CopyrightModel copyright, String privacy, String schedule_published_on, int id, String description, String organizer_description, VersionModel version, String state, String timezone, Call_for_papersModel call_for_papers, String type, String end_time, String start_time, String name, String background_image, String email, String topic) {

		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this.state = state;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this.email = email;
		this.topic = topic;

	}

}