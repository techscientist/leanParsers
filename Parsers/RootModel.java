import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String organizer_name;
	public VersionModel _version;
	public String logo;
	public String code_of_conduct;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;
	public CreatorModel _creator;
	public String state;
	public String organizer_description;
	public String description;
	public String start_time;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String topic;

	public RootModel(String name, String location_name, String organizer_name, VersionModel version, String logo, String code_of_conduct, String email, String privacy, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id, CreatorModel creator, String state, String organizer_description, String description, String start_time, String background_image, String type, Call_for_papersModel call_for_papers, String end_time, CopyrightModel copyright, String timezone, String topic) {

		this.name = name;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._version = version;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._creator = creator;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.topic = topic;

	}

}