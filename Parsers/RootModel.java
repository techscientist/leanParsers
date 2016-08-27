import java.util.ArrayList;

class RootModel {

	public String description;
	public String schedule_published_on;
	public String email;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String type;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String end_time;
	public String state;
	public String start_time;
	public int id;
	public String background_image;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String topic;

	public RootModel(String description, String schedule_published_on, String email, String name, String code_of_conduct, String organizer_name, String type, VersionModel version, ArrayList<Social_linksModel> social_links, String timezone, String end_time, String state, String start_time, int id, String background_image, String organizer_description, CreatorModel creator, String logo, String privacy, String location_name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String topic) {

		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.type = type;
		this._version = version;
		this.social_links = social_links;
		this.timezone = timezone;
		this.end_time = end_time;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.topic = topic;

	}

}