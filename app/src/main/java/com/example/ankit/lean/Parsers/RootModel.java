import java.util.ArrayList;

class RootModel {

	public int id;
	public String code_of_conduct;
	public String start_time;
	public String name;
	public CopyrightModel _copyright;
	public String email;
	public String type;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String state;
	public String logo;
	public String organizer_name;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String location_name;
	public String organizer_description;
	public String topic;

	public RootModel(int id, String code_of_conduct, String start_time, String name, CopyrightModel copyright, String email, String type, String description, Call_for_papersModel call_for_papers, String privacy, String state, String logo, String organizer_name, VersionModel version, String timezone, String schedule_published_on, CreatorModel creator, String end_time, ArrayList<Social_linksModel> social_links, String background_image, String location_name, String organizer_description, String topic) {

		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.name = name;
		this._copyright = copyright;
		this.email = email;
		this.type = type;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.state = state;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}