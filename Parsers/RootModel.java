import java.util.ArrayList;

class RootModel {

	public String start_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String code_of_conduct;
	public String background_image;
	public String organizer_description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String type;
	public String email;
	public String description;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public int id;
	public String topic;

	public RootModel(String start_time, CreatorModel creator, CopyrightModel copyright, String end_time, VersionModel version, String code_of_conduct, String background_image, String organizer_description, String name, Call_for_papersModel call_for_papers, String logo, ArrayList<Social_linksModel> social_links, String timezone, String type, String email, String description, String organizer_name, String location_name, String privacy, String state, String schedule_published_on, int id, String topic) {

		this.start_time = start_time;
		this._creator = creator;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.type = type;
		this.email = email;
		this.description = description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.topic = topic;

	}

}