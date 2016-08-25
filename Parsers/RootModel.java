import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String state;
	public CreatorModel _creator;
	public String name;
	public String email;
	public String end_time;
	public String timezone;
	public CopyrightModel _copyright;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public String start_time;
	public String logo;
	public String organizer_description;
	public String background_image;
	public String organizer_name;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(VersionModel version, String state, CreatorModel creator, String name, String email, String end_time, String timezone, CopyrightModel copyright, String location_name, String type, String schedule_published_on, String start_time, String logo, String organizer_description, String background_image, String organizer_name, String description, String code_of_conduct, String privacy, ArrayList<Social_linksModel> social_links, int id, Call_for_papersModel call_for_papers, String topic) {

		this._version = version;
		this.state = state;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.social_links = social_links;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}