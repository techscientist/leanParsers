import java.util.ArrayList;

class RootModel {

	public String state;
	public String description;
	public String end_time;
	public String schedule_published_on;
	public String name;
	public String timezone;
	public CreatorModel _creator;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String email;
	public String logo;
	public String privacy;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String topic;

	public RootModel(String state, String description, String end_time, String schedule_published_on, String name, String timezone, CreatorModel creator, String type, String start_time, ArrayList<Social_linksModel> social_links, int id, String background_image, String code_of_conduct, CopyrightModel copyright, String organizer_name, String email, String logo, String privacy, String location_name, VersionModel version, Call_for_papersModel call_for_papers, String organizer_description, String topic) {

		this.state = state;
		this.description = description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.timezone = timezone;
		this._creator = creator;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.email = email;
		this.logo = logo;
		this.privacy = privacy;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}